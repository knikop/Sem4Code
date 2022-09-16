<?php
namespace app\controllers;

class Main extends \app\core\Controller{
	public function index(){
		$this->view('Main/index');
	}

	public function about_us(){
		$this->view('Main/about_us');
	}

	public function contact(){
		$this->view('Contact/contact');
	}

	public function read(){
		$this->view('Contact/read');
	}
}