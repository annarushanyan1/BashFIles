# ԽՆԴՐԻ ՆԿԱՐԱԳՐՈՒԹՅՈՒՆԸ ՏԵՍ ՆԵՐՔԵՎՈՒՄ
# Գրել սկրիպտ, որը արգումենտում ստանում է թիվ:
# և էկրանին տպում թե արդյոք այդ թիվը Արմսթրոնգի թիվ է
# Հուշում։ Արմսթրոնգի թիվն այն թիվն է, որն իր սեփական թվանշանների գումարն է,
# որոնցից յուրաքանչյուրը բարձրացված է թվի թվանշանների քանակի աստիճանին։
# Խնդիրը սկսելուց առաջ համոզվիր որ պահանջը պարզ է։

echo "Enter the number"
read number
t=$number
s=0
c=10

length=${#number}
while ((number > 0 ))
do
   r=$((number % c))
   i=1
   k=0
   while(( k < length))
   do
  	i=$((i * r))
	k=$((k + 1))
   done
   s=$((s + i))
   number=$((number / c))
done

if [ $s == $t ]
then
echo "Amstrong number"
else
echo "Not an Armstrong number"
fi

