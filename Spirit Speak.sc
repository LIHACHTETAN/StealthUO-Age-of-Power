Program New;
begin
 while true do                                                  //
 begin          
 useskill('Spirit Speak');
 wait(3000);
 if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
  end;        
end.