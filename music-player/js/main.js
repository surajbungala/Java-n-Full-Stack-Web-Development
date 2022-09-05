$(function(){
    $('.menu-btn').on('click', function(){
        $('header').toggleClass('mobile-menu-active')
    })
    $('.close').on('click', function(){
        $('header').removeClass('mobile-menu-active')
    })
});