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
   UseSkill('Item Identification');
   wait(100); 
    if targetpresent then
                    begin
                    TargetToObject($71596011);
                    end;
                        
   wait(3100);
 end;
end.