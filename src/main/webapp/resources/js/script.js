/**
 * Created by Marcin on 2015-02-21.
 */
$('.datagrid tr').bind('click', function(){
    window.location = 'http://somelocation.com';
    // Or, we can grab the HREF from the first anchor:
    // window.location = $('a:first', this).attr('href');
});