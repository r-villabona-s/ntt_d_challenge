package ntt.data.challenge.services;
import java.math.BigInteger;
import org.springframework.stereotype.Service;

@Service
public class FactorialService implements IFactorialService {

	@Override
	public BigInteger getFactorial(int number) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= number; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}

}
