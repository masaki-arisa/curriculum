let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
	for (let i = 0; i<numbers.length;i++){
	 if (numbers[i] % 2 === 0){
		num = numbers[i];
		console.log(num + 'は偶数です');
		}
	}
}

isEven();

class Car{
	constructor(gasoline,number){
		this.gasoline = gasoline;
		this.number = number;
	}
	getNumGas(){
		console.log(`ガソリンは${this.gasoline}です。ナンバーは${this.number}です`);
	}
}
let a = new Car('a','b');
a.getNumGas();