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
   UseSkill('Anatomy'); 
    if targetpresent then
                    begin
                    TargetToObject($076D08B8);
                    end;
                        
   wait(3000);
 end;
end.
