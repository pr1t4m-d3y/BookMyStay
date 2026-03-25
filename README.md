# Book My Stay App – Use Case 4

## Approach
- Guests can view available rooms without modifying inventory.
- RoomSearchService provides read-only search functionality.
- RoomInventory holds availability counts centrally.
- Room classes define characteristics (beds, size, price).
- Clear separation: Search = read-only, Booking = write operations.

## Flow
1. Guest initiates a room search request.
2. System retrieves availability data from RoomInventory.
3. Room details and pricing are obtained from Room objects.
4. Rooms with zero availability are filtered out.
5. Available room types and their details are displayed.
6. System state remains unchanged.

## Key Concepts
- Read-only access ensures safe data usage.
- Defensive programming checks availability before display.
- Separation of concerns: search logic isolated from booking logic.
- Inventory acts as the single source of truth for availability.
- Domain model provides descriptive room information.
- Validation excludes unavailable room types.

## Benefits
- Accurate availability visibility without state mutation.
- Reduced risk of accidental inventory corruption.
- Clear boundary between search and booking responsibilities.
- Guests see only actionable options.

## Drawbacks of Previous Use Case
- Use Case 3 centralized inventory but did not enforce read-only access.
- Risk of accidental modification during non-booking operations.
