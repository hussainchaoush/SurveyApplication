<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Event Feedback Form</title>
<style>
#form_attended, #form_not_attended {
    display: none;
}
</style>
<script>
function toggleForm() {
    var attendedYes = document.getElementById("attended_yes");
    var attendedNo = document.getElementById("attended_no");
    var formAttended = document.getElementById("form_attended");
    var formNotAttended = document.getElementById("form_not_attended");

    if (attendedYes.checked) {
        formAttended.style.display = "block";
        formNotAttended.style.display = "none";
    } else if (attendedNo.checked) {
        formAttended.style.display = "none";
        formNotAttended.style.display = "block";
    }
}
</script>
 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            // jQuery code to manipulate the DOM
            $("#1").click(function() {
                $("#2").show(); // Toggle the visibility of paragraphs
            });
            $("#2").click(function() {
                $("#3").show(); // Toggle the visibility of paragraphs
            });
            $("#3").click(function() {
                $("#4").show(); // Toggle the visibility of paragraphs
            });
        });
            $(document).ready(function() {
            $('input[name="reason"]').change(function() {
                var selectedValue = $(this).val();
                if (selectedValue === 'other') {
                    $('#otherReason').show();
                } else {
                    $('#otherReason').hide();
                }
            });
        });
    </script>

</head>
<body>

<h2>Event Feedback Form</h2>

<label>1. Have you attended the recent event organized by HR?</label><br>
<input type="radio" id="attended_yes" name="attended" value="Yes" onclick="toggleForm()" required>
<label for="attended_yes">Yes</label><br>
<input type="radio" id="attended_no" name="attended" value="No" onclick="toggleForm()">
<label for="attended_no">No</label><br><br>

<form:form id="form_attended" modelAttribute="attended" action="/submitAttendedForm" method="post">
  <div id='1'>
  <label>2. Did you participate?</label><br>
  <form:radiobutton path="participated" value="Yes" required="true" /> Yes
  <form:radiobutton path="participated" value="No" /> No
  <br><br>
  </div>
   <div id='2' style="display: none;">
  <label>3. Was it engaging?</label><br>
  <form:radiobutton path="engaging" value="Yes" required="true" /> Yes
  <form:radiobutton path="engaging" value="No" /> No
  <br><br>
  </div>
   <div id='3' style="display: none;">
  <label>4. Do you continue to participate in such engaging events?</label><br>
  <form:radiobutton path="continueParticipate" value="Yes" required="true" /> Yes
  <form:radiobutton path="continueParticipate" value="No" /> No
  <br><br>
  </div>
   <div id='4' style="display: none;">
  <label>5. What would be the overall rating that you would give for this event?</label><br>
  <form:radiobutton path="rating" value="1" required="true" /> 1 - Dissatisfied
  <form:radiobutton path="rating" value="2" /> 2 - Somewhat Dissatisfied
  <form:radiobutton path="rating" value="3" /> 3 - Neutral
  <form:radiobutton path="rating" value="4" /> 4 - Satisfied
  <form:radiobutton path="rating" value="5" /> 5 - Extremely Satisfied
  <br><br>
  </div>
  
  <input type="submit" value="Submit Feedback">
</form:form>

<form:form id="form_not_attended" action="/submitNotAttendedForm" method="post" style="display: none;" modelAttribute="notAttended">
    <label>2. Reason for not attending:</label><br>
    <form:radiobutton path="reason" id="reason_busy" value="busy" required='true'/>
    <label for="reason_busy">Busy</label><br>
    <form:radiobutton path="reason" id="reason_not_interested" value="not-interested"/>
    <label for="reason_not_interested">Not interested</label><br>
    <form:radiobutton path="reason" id="reason_time_conflict" value="time-conflict"/>
    <label for="reason_time_conflict">Had a time conflict</label><br>
    <form:radiobutton path="reason" id="reason_other"  value="other"/>
    <label for="reason_other">Other</label><br><br>
     <div id="otherReason" style="display: none;">
        <label>Please specify:</label><br>
        <form:input path='reason' name="otherReasonDescription"/><br><br>
    </div>
    <input type="submit" value="Submit Not Attended Feedback">
</form:form>


</body>

</html>



    