function updateTime() {
    const timeElement = document.getElementById('time');
    const now = new Date();
    let hours = now.getHours();
    const minutes = now.getMinutes().toString().padStart(2, '0');
    const seconds = now.getSeconds().toString().padStart(2, '0');
    const ampm = hours >= 12 ? 'PM' : 'AM';
    
    hours = hours % 12;
    hours = hours ? hours : 12; // The hour '0' should be '12'
    const strTime = `${hours.toString().padStart(2, '0')}:${minutes}:${seconds} ${ampm}`;
    
    timeElement.textContent = strTime;
}

setInterval(updateTime, 1000);
updateTime(); // Initial call to set the time immediately
