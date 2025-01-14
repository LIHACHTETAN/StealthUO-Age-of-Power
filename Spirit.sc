Program New;
begin
 while true do 
 begin 

    if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
   UseSkill('Spirit Speak');                    
   wait(3100);
 end;
end.
tar