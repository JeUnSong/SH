$( document ).ready( function() {
    var jbOffset = $( '.search-container' ).offset();

    $( window ).scroll( function() {
        if ( $( document ).scrollTop() > jbOffset.top ) {
                $( '.search-container').addClass( 'search-fixed' );
        }else {
            $( '.search-container' ).removeClass( 'search-fixed' );
        }
    });
});

$( document ).ready( function() {
    var jbOffset = $( '.search-container' ).offset();

    $( window ).scroll( function() {
        if ( $( document ).scrollTop() > jbOffset.top ) {
            $( '.search-item').addClass( 'search-scale' );
        }else {
            $( '.search-item' ).removeClass( 'search-scale' );
        }
    });
});

$( document ).ready( function() {
    var jbOffset = $( '.search-container' ).offset();

    $( window ).scroll( function() {
        if ( $( document ).scrollTop() > jbOffset.top ) {
            $( '.search-icon').addClass( 'search-icon-scroll' );
        }else {
            $( '.search-icon' ).removeClass( 'search-icon-scroll' );
        }
    });
});
