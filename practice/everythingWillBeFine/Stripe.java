package everythingWillBeFine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    enum PaymentState {
        REQUIRES_ACTION, PROCESSING, COMPLETED
    }

    class Payment {
        String id;
        int amount;
        PaymentState state;
        int successTimestamp;

        public Payment(String id, int amount, PaymentState state, int successTimestamp) {
            this.id = id;
            this.amount = amount;
            this.state = state;
            this.successTimestamp = successTimestamp;
        }
    }

    class Merchant{
        String id;
        int balance;
        int refundTimestamp;

        public Merchant(String id, int balance, int refundTimestamp) {
            this.id = id;
            this.balance = balance;
            this.refundTimestamp = refundTimestamp;
        }
    }

    class processer{
        Map<String, Payment> paymentMap = new HashMap<>();
        Map<String, Merchant> merchantMap = new HashMap<>();

        public void process(String command){
            String[] parts = command.split(" ");
            String commandType = parts[0];

            if (commandType.equals("INIT")) {
                String paymentId = parts[1];
                int amount = Integer.parseInt(parts[2]);
                int 
            } else if (commandType.equals("REFUND")) {
                String merchantId = parts[1];
                int refundAmount = Integer.parseInt(parts[2]);
                int refundTimestamp = Integer.parseInt(parts[3]);
                Merchant merchant = merchantMap.get(merchantId);
                if (merchant == null) {
                    merchant = new Merchant(merchantId, 0, refundTimestamp);
                    merchantMap.put(merchantId, merchant);
                }
                merchant.balance += refundAmount;
                merchant.refundTimestamp = refundTimestamp;
            }
        }
    }

        
        

       
        




    Class Stripe{

        public static void main(String[] args) {
        
        }



    }
