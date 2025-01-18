Program Animal_Lore;
begin
 while true do 
 begin 

    if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
   UseSkill('Animal Lore'); 
    if targetpresent then
                    begin
                    TargetToObject($08A25222);
                    end;
                        
   wait(3000);
 end;
end.
