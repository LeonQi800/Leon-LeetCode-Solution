// recursive
function Permutations(str) {
  var results = [];

if (str.length === 1){
	results.push(str)
	return results;
}

for (let i = 0; i < str.length; i++){
	let first = str[i];
	let left = str.substring(0,i) + str.substring(i+1);
	let inner = Permutations(left);
	for (let j = 0; j < inner.length; j++){
		results.push(first + inner[j])
		}
	}
	return results;
}
