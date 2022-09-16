<?php
namespace app\controllers;

class Count extends \app\core\Controller {
    private static $res = 'app/resources/counter.txt';

    public function index(){
        if (file_exists(self::$res)) {
            $fh = fopen(self::$res, 'r');
            flock($fh, LOCK_SH);
            $counter = fread($fh, 1024);
            flock($fh, LOCK_UN);
            fclose($fh);
        }else{
            $counter = '{"count":0}';
        }     
        $dCounter = json_decode($counter);
        $dCounter->count++;
        $counter = json_encode($dCounter);
        echo ($counter);
        $fh = fopen(self::$res, 'w');
        flock($fh,LOCK_EX);
        fwrite($fh, $counter);
        fclose($fh);
            
    }
}