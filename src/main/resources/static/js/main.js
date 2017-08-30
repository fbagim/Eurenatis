$(document).ready(function () {
  loadCountry();
    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        fire_ajax_submit();

    });

});

function loadCountry() {
 $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "http://localhost:8080/jetsetter/api/country/",
       // data: JSON.stringify(arr),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            var $select = $('#id_country'); //$('#down');
            $select.find('option').remove();
            $.each(data, function(key, value) {
                  if (value.countryName != null) {
                     $('<option>').val(value.countryIso).text(value.countryName).appendTo($select);
                  }
            });

//
//
//
//            var json = "<h4>Ajax Response</h4><pre>"
//                + JSON.stringify(data, null, 4) + "</pre>";
//            $('#feedback').html(json);
//
//            console.log("SUCCESS : ", data);
//            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}
function fire_ajax_submit() {

    var search = {}
    search["username"] = $("#username").val();
    //search["email"] = $("#email").val();

    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/search",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}