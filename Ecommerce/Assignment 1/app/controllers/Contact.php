<?php
namespace app\controllers;

class Contact extends \app\core\Controller {

    public function index(){
        if(isset($_POST['action'])){
            $wd = ['author' =>$_POST['email'], 'message'=>$_POST['message']];
            $ws = json_encode($wd);
            $fh = fopen('app/resources/log.txt', 'a');
            flock($fh, LOCK_EX);
            fwrite($fh, $ws . "\n");
        }
        $this->view('Contact/index');
    }

    public function read(){
        if(file_exists('app/resources/log.txt')){
            $messages = file('app/resources/log.txt');
            $this->view('Contact/read', $messages);
        }else{
            $this->view('Contact/read');
        }
    }
}