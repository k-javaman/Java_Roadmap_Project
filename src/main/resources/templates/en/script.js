// // Store checkbox state in localStorage
// const checkbox = document.getElementById('flexSwitchCheckDefault');
//
// checkbox.addEventListener('change', function() {
//     localStorage.setItem('checkboxState', this.checked);
// });
//
// // On page load, set the checkbox state to what's in localStorage
// window.addEventListener('load', function() {
//     const savedCheckboxState = localStorage.getItem('checkboxState');
//     if (savedCheckboxState !== null) checkbox.checked = (savedCheckboxState === 'true');
// });
//
// var switch1 = document.getElementById('customSwitch1');
//
// // Save the state to localStorage whenever it changes
// switch1.addEventListener('change', function() {
//     localStorage.setItem('switchState', this.checked);
// });
//
// // When the page loads, get the state from localStorage and set the switch accordingly
// window.addEventListener('load', function() {
//     var savedState = localStorage.getItem('switchState');
//     switch1.checked = (savedState === 'true') ? true : false;
// });

// get all the switch elements
const switchElements = document.querySelectorAll('.form-check-input');

// loop over all the switch elements
switchElements.forEach(function(switchEl) {
    const switchId = switchEl.id;

    // Save the state to localStorage whenever it changes
    switchEl.addEventListener('change', function() {
        localStorage.setItem(switchId, this.checked);
    });

    // When the page loads, get the state from localStorage and set the switch accordingly
    window.addEventListener('load', function() {
        var savedState = localStorage.getItem(switchId);
        switchEl.checked = (savedState === 'true') ? true : false;
    });
});