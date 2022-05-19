$( document ).ready( function() {
    var jbOffset = $( '.search-container' ).offset();

    $( window ).scroll( function() {
        if ( $( document ).scrollTop() > jbOffset.top ) {
                $( '.search-container' ).addClass( 'search-fixed' );
        }else {
            $( '.search-container' ).removeClass( 'search-fixed' );
        }
    });
});