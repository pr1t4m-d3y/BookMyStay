# Book My Stay App – Use Case 6

## Approach
- Confirms booking requests by assigning unique room IDs.
- Uses Set<String> to enforce uniqueness of room IDs.
- Maps room types to allocated IDs with HashMap<String, Set<String>>.
- Updates inventory immediately after allocation.
- Prevents double-booking by design.

## Flow
1. Booking request dequeued from FIFO queue.
2. System checks availability for requested room type.
3. Unique room ID generated and assigned.
4. Room ID recorded to prevent reuse.
5. Inventory count decremented immediately.
6. Reservation confirmed.

## Key Concepts
- Double-booking problem solved with Set enforcing uniqueness.
- HashMap groups room IDs by type for tracking.
- Atomic operations: allocation + inventory update together.
- Inventory synchronization ensures consistent state.

## Benefits
- Guaranteed uniqueness of room assignments.
- Immediate synchronization between booking and inventory.
- Elimination of double-booking scenarios.
- Predictable and safe allocation process.

## Drawbacks of Previous Use Case
- Use Case 5 handled request ordering but not confirmation.
- No uniqueness enforcement, risk of conflicting assignments.
