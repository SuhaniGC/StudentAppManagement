let slideIndex = 0;
showSlides();

function showSlides() {
  let i;
  let slides = document.getElementsByClassName("mySlides");
  // Hide all slides and remove animation classes
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
    slides[i].classList.remove("fade");
    slides[i].classList.remove("slide-in");
  }

  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}

  // Display the current slide and add the animation class
  slides[slideIndex-1].style.display = "block";
  slides[slideIndex-1].classList.add("fade"); // Change "fade" to "slide-in" if you prefer the slide-in effect


  setTimeout(showSlides, 4000); // Change image every 2 seconds
}
