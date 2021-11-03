   Я считаю, что интерфейс CoordinateFinder лушче назвать MoveParameterProvider,
потому что его задача предоставить параметры хода (координаты и символ игрока),
а не искать координаты. 
   Соотвественно, и метод findCoordinate лучше назвать provide. 
   Тогда напрашивается и переименование класса MoveResult в класс MoveParameters 
   (так как сам ход осуществляется именно в методе doMove класса TicTacToe), 
   класса AICoordinateFinder в класс AiMoveParameterProvider, 
   класса PlayerCoordinateFinder в класс PlayerMoveParameterProvider.
   
   
   