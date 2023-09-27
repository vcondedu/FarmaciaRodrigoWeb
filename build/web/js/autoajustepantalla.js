var height_header;
var height_footer;
var height_window;
function ajustar_pantalla(bordes_height){
    height_window=$(window).height();
    height_header=$('#header').height();
    height_footer=$('#footer').height();
    var height_content=height_window-(height_header+height_footer+bordes_height);
    $('#items').height(height_content);
    $('#content').height(height_content);
    $('#explorer').height(height_content);
}
