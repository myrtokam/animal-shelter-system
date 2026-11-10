// Κοινή πλοήγηση + βοηθητικές συναρτήσεις
function esc(s) { // προστασία από XSS: όλα τα δεδομένα περνούν από εδώ πριν μπουν στη σελίδα
  const d = document.createElement("div"); d.textContent = s ?? ""; return d.innerHTML;
}
function fmtDate(s) { return s ? new Date(s).toLocaleDateString("el-GR") : "—"; }

(function renderNav() {
  const pages = [["index.html", "🏠", "Αρχική"], ["animals.html", "🐾", "Τα ζώα μας"], ["animal-new.html", "➕", "Νέα καταχώριση"], ["medical.html", "🩺", "Ιατρικά αρχεία"]];
  const here = location.pathname.split("/").pop() || "index.html";
  const el = document.getElementById("nav");
  el.className = "sidebar";
  el.innerHTML = '<div class="brand"><svg viewBox="0 0 24 24" aria-hidden="true"><ellipse cx="5" cy="10" rx="2" ry="2.7"/><ellipse cx="9.3" cy="5.6" rx="2" ry="2.7"/><ellipse cx="14.7" cy="5.6" rx="2" ry="2.7"/><ellipse cx="19" cy="10" rx="2" ry="2.7"/><path d="M12 11c-3 0-6 3.2-6 6 0 2 1.6 3 3.2 3 1 0 1.9-.5 2.8-.5s1.8.5 2.8.5c1.6 0 3.2-1 3.2-3 0-2.8-3-6-6-6z"/></svg>PawBase</div>' + pages.map(([href, icon, label]) =>
    `<a href="${href}" ${href === here ? 'class="active" aria-current="page"' : ""}><span aria-hidden="true">${icon}</span>${label}</a>`).join("");
})();

function avatar(id) { return '<span class="av av-' + id + '" aria-hidden="true">' + (EMOJI[id] || "🐾") + "</span>"; }
