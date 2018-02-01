<!DOCTYPE html>
<head>
  <title>Welcome To Struts 2 chat!</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/custom.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://media.twiliocdn.com/sdk/js/chat/v1.2/twilio-chat.min.js"></script>
  <script src="assets/custom.js"></script>
</head>
<body>
   <h1 class="text-center">Welcome To Struts 2 chat!</h1>
   
    <div class="container" style="border: 2px solid gray;">
            <!--msgbox-->
      		<div id="msgItems" class="container-fluid">
         	</div>
              
            <!-- querybox-->
            <div class="row text-center" id="queryText">
                  
               <div class="hideForm">
                    <div class="row">
                        <div class="col-xs-9">
                             <input type="text" class="form-control" placeholder="Type your Message Here" id="message">
                        </div>
                        <div class="col-xs-3">
                            <button type="button" class="btn btn-primary" id="submitMessage">Send Message</button>
                        </div>
                    </div>
               </div>
               
               <div class="initiateChat">
                   <div class="row"> <h4>Setting up chat, Please wait...</h4> </div>
               </div>
               
               <div id="chatName">
                     <form class="form-inline">
                        <div class="form-group">
                             <input type="text" class="form-control" id="userName" placeholder="your username">
                        </div>
                             <button type="button" class="btn btn-primary" id="startChating">Start Chating!</button>
                    </form>
               </div>
                    
           </div>       
    </div>
</body>
</html>