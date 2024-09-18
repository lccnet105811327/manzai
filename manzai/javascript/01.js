let year = document.getElementById("year");
year.textContent = new Date().getFullYear();

let btn = document.getElementById("button");
let banner = document.getElementsByClassName("banner")[0];
let box = document.getElementsByClassName("box");
let hover = document.getElementsByClassName("hover");
btn.addEventListener('click', function(){
    banner.classList.add('colorPicker');
    setTimeout(colorPicker,2000);
});
// color changing according to colorpicker
function colorPicker(){
    reset();
    const colorIndex = Math.floor(Math.random() * 5);
    if(colorIndex === 0){
        banner.style.backgroundImage = "url('img/banner_000.png')";
        border('#c23073');
        background();
        hoverEffect('hoverEffectZero');
    }else if(colorIndex === 1){
        banner.style.backgroundImage = "url('img/banner_001.png')";
        border('#dc6535');
        background();
        hoverEffect('hoverEffectOne');
    }else if(colorIndex === 2){
        banner.style.backgroundImage = "url('img/banner_002.png')";
        border('#449bce');
        background();
        hoverEffect('hoverEffectTwo');
    }else if(colorIndex === 3){
        banner.style.backgroundImage = "url('img/banner_003.png')";
        border('#29b7b0');
        background();
        hoverEffect('hoverEffectThree');
    }else if(colorIndex === 4){
        banner.style.backgroundImage = "url('img/banner_004.png')";
        border('#7c1496');
        background();
        hoverEffect('hoverEffectFour');
    }
};
function reset(){
    for (const i of hover) {
        i.className = 'hover';
    }
    banner.className = 'banner';
};
function border(e){
    for (const i of box) {
        i.style.borderColor = e; 
    }
}
function background(){
    banner.style.backgroundSize = 'cover';
    banner.style.backgroundPosition = 'center'; 
};
function hoverEffect(e){
    for (const i of hover) {
        i.classList.add(e);
    }
};
//flyin animation
function flyin(){
    if(window.scrollY >=725){
        for (const i of box) {
            i.style.opacity = 1; 
            i.style.transform = 'translateY(0px)'
        }
    }else{
        for (const i of box) {
            i.style.opacity = 0; 
            i.style.transform = 'translateY(50px)'
        }
    }
};
window.addEventListener("scroll",flyin)