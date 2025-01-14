////////////////////////////////////////////////////////////////////////////////
/////////////////////////////Skype LIHACH2003///////////////////////////////////
/////////////////////////////ICQ 262489116//////////////////////////////////////
/////////////////////////////email lihachtetan@rambler.ru///////////////////////
/////////////////////////////1.0 Resisting Spells Shard Age of Power////////////
/////////////////////////////The script is written LIHACH///////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////Настройка///////////////////////////////////////
//////////////В рюкзак кладёте бинты , банки (ГХ) , Фишстейки///////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////   
Program Resisting;
var t : Integer;
Begin
while true do
 begin
   for t:= 1 to  29 do
   begin
   AddToSystemJournal('|||||||||||||||||||||||||||');
   AddToSystemJournal('Кушать будем когда 30>: ' + IntToStr(t));
    if (Life < MaxLife) then 
    begin
     AddToSystemJournal('Востанавливаем Здоровья |||');
     if (Life <= 60) then 
     begin
        if FindType( $0F0C, Backpack) <> 0 THEN
        begin
        AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
        AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));
        UOSay(Chr(39)+'pc quaf heal' );
        AddToSystemJournal('|||||||||||||||||||||||||||');
        end;
     AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
     AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));     
     UOSay(Chr(39)+'pc heal self' );
     AddToSystemJournal('|||||||||||||||||||||||||||');
     end;
      if (Life > 60) then wait (350);
      begin
      AddToSystemJournal('Здоровья чара>>>>>>>>>: ' + IntToStr(Life));
      AddToSystemJournal('Максимум здоровья чара: ' + IntToStr(MaxLife));     
      UOSay(Chr(39)+'pc heal self' );
      AddToSystemJournal('|||||||||||||||||||||||||||');
      end;
    wait(8000);
    end;
    end;
    if FindType($097B, BackPack) > 0 THEN
    begin
    AddToSystemJournal('Кушаем фишстейки!!! 30=:' + IntToStr(t));
    UseObject(finditem);
    wait(1000);
    AddToSystemJournal('||||||||||||||||||||||||');
    end;      
end; 
End.