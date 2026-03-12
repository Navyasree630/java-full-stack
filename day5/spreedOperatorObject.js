const defaults = { theme: 'dark', lang: 'en', font: 'mono' };
const userPrefs = { lang: 'hi', fontSize: 14 };
// Merge (later keys win)
const config = { ...defaults, ...userPrefs };
// { theme: 'dark', lang: 'hi', font: 'mono', fontSize: 14 }
// Clone object (shallow)
const clone = { ...defaults }