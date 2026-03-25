# Book My Stay App – Use Case 5

## Approach
- Introduces booking request intake mechanism.
- Uses Queue<Reservation> to store requests in arrival order.
- Reservation class captures guest intent (guest name + room type).
- BookingRequestQueue manages requests fairly using FIFO principle.
- No inventory mutation or room allocation at this stage.

## Flow
1. Guest submits a booking request.
2. Request is added to the booking queue.
3. Queue preserves arrival order automatically.
4. Requests wait for allocation system to process them.
5. System state remains unchanged until allocation.

## Key Concepts
- Queue data structure models real-world waiting lines.
- FIFO ensures fairness: earliest request processed first.
- Request ordering guaranteed without manual sorting.
- Decoupling intake from allocation improves scalability.

## Benefits
- Fair and deterministic request handling.
- Predictable behavior under peak demand.
- Simplified coordination before allocation.
- Equal treatment of all guests based on arrival time.

## Drawbacks of Previous Use Case
- Use Case 4 allowed room visibility but not booking intent.
- No mechanism to handle simultaneous booking attempts.
- Risk of unfair or inconsistent request handling.
