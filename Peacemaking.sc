Program New;
begin
 while true do                                                  //
 begin          
 useskill('Peacemaking');
 wait(3000);
  if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('������ ���������!!!');
    UseObject(finditem);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;
  end;        
end.