//
// // get all the switch elements
// const switchElements = document.querySelectorAll('.form-check-input');
//
// // loop over all the switch elements
// switchElements.forEach(function(switchEl) {
//     const switchId = switchEl.id;
//
//     // Save the state to localStorage whenever it changes
//     switchEl.addEventListener('change', function() {
//         localStorage.setItem(switchId, this.checked);
//     });
//
//     // When the page loads, get the state from localStorage and set the switch accordingly
//     window.addEventListener('load', function() {
//         var savedState = localStorage.getItem(switchId);
//         switchEl.checked = (savedState === 'true') ? true : false;
//     });
// });
