#!/usr/local/bin/ruby

$i = 0
puts "start"
while $i < 100 do 
	puts "newcar,0,#$i,1,1"
	puts "newroom,0,#$i,1,1"
	puts "newflight,0,#$i,1,1"
	$i += 1
end
puts "commit,0"
puts "start"
puts "starttiming"
while $i < 1005 do 
	puts "newcar,1,#$i,1,1"
	puts "newroom,1,#$i,1,1"
	puts "newflight,1,#$i,1,1"
	$i += 1
end
puts "stoptiming"