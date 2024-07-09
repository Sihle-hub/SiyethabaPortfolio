
const navbarToggleBtn = document.getElementById('navbarToggleBtn');
const navbarLinks = document.querySelector('.navbar');

navbarToggleBtn.addEventListener('click', function() {
    navbarLinks.classList.toggle('active');
});


var typed = new Typed(".multiple-text" ,{
	strings: ["Frontend Developer" , "Backend Developer" , "Database administrator" , "Database development"],
	typeSpeed:100,
	backSpeed:100,
	backDelay:1000,
	loop: true
})



