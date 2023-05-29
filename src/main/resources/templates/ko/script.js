// Store checkbox state in localStorage
const checkbox = document.getElementById('flexSwitchCheckDefault');

checkbox.addEventListener('change', function() {
    localStorage.setItem('checkboxState', this.checked);
});

// On page load, set the checkbox state to what's in localStorage
window.addEventListener('load', function() {
    const savedCheckboxState = localStorage.getItem('checkboxState');
    if (savedCheckboxState !== null) checkbox.checked = (savedCheckboxState === 'true');
});