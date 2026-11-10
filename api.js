// Επίπεδο δεδομένων. Τώρα δουλεύει με δοκιμαστικά δεδομένα (localStorage).
// Όταν υπάρξει Java backend (REST), βάλε USE_MOCK = false και άλλαξε το API_BASE.
const USE_MOCK = true;
const API_BASE = "http://localhost:8080/api";

const SPECIES = {1: "Σκύλος", 2: "Γάτα", 3: "Άλλο"};
const STATUSES = {1: "Στο καταφύγιο", 2: "Υπό θεραπεία", 3: "Σε φιλοξενία", 4: "Υιοθετήθηκε"};
const EMOJI = {1: "🐶", 2: "🐱", 3: "🐰"};
const SEX = {MALE: "Αρσενικό", FEMALE: "Θηλυκό", UNKNOWN: "Άγνωστο", INTERSEX: "Διαφυλικό"};

const SEED = {
  animals: [
    {animal_id: 1, name: "Rex", microchip_number: "300123456789012", species_id: 1, sex: "MALE", status_id: 1, color: "Καφέ", weight: 25.5, sterilized: true, special_needs: false, intake_date: "2026-09-12", description: "Φιλικός και ενεργητικός."},
    {animal_id: 2, name: "Μίλα", microchip_number: "", species_id: 2, sex: "FEMALE", status_id: 2, color: "Γκρι", weight: 3.8, sterilized: false, special_needs: true, intake_date: "2026-10-03", description: "Χρειάζεται καθημερινή φαρμακευτική αγωγή."}
  ],
  medical: [
    {id: 1, animal_id: 2, date: "2026-10-05", doctor: "Δρ. Παπαδοπούλου", diagnosis: "Λοίμωξη ανώτερου αναπνευστικού", treatment: "Αντιβιοτική αγωγή 10 ημερών", prescriptions: "Αμοξικιλλίνη", notes: "Επανέλεγχος σε 2 εβδομάδες."}
  ]
};

function load(key) {
  try {
    const raw = localStorage.getItem("shelter_" + key);
    if (raw) return JSON.parse(raw);
  } catch (e) { /* αγνόησε και ξαναφόρτωσε τα δοκιμαστικά */ }
  return structuredClone(SEED[key]);
}
function save(key, rows) {
  try { localStorage.setItem("shelter_" + key, JSON.stringify(rows)); } catch (e) {}
}
async function http(path, options) {
  const res = await fetch(API_BASE + path, {headers: {"Content-Type": "application/json"}, ...options});
  if (!res.ok) throw new Error("Σφάλμα διακομιστή (" + res.status + ")");
  return res.json();
}

const api = {
  async getAnimals() { return USE_MOCK ? load("animals") : http("/animals"); },
  async createAnimal(a) {
    if (!USE_MOCK) return http("/animals", {method: "POST", body: JSON.stringify(a)});
    const rows = load("animals");
    a.animal_id = Math.max(0, ...rows.map(r => r.animal_id)) + 1;
    rows.push(a); save("animals", rows); return a;
  },
  async getMedical() { return USE_MOCK ? load("medical") : http("/medical-records"); },
  async createMedical(m) {
    if (!USE_MOCK) return http("/medical-records", {method: "POST", body: JSON.stringify(m)});
    const rows = load("medical");
    m.id = Math.max(0, ...rows.map(r => r.id)) + 1;
    rows.push(m); save("medical", rows); return m;
  }
};
