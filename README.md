# Frontend (PawBase)

Στατικό UI με HTML, CSS και Bootstrap 5. Δεν χρειάζεται build.

## Εκτέλεση
Άνοιξε το `index.html` στον browser ή τρέξε από αυτόν τον φάκελο: `python3 -m http.server 5500` και πήγαινε στο http://localhost:5500

## Σύνδεση με backend
Το `js/api.js` δουλεύει τώρα με δοκιμαστικά δεδομένα (`USE_MOCK = true`, αποθηκεύονται στον browser).
Όταν φτιαχτεί το Java REST API: βάλε `USE_MOCK = false` και ρύθμισε το `API_BASE`.
Endpoints που περιμένει: GET/POST `/animals`, GET/POST `/medical-records`.
