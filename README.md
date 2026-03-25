# Book My Stay App – Use Case 3

## Approach
- Centralized inventory replaces scattered availability variables.
- Room availability stored in a HashMap<String, Integer>.
- RoomInventory class encapsulates all inventory logic.
- Room classes define characteristics (beds, size, price).
- Separation of concerns: Room = "what it is", Inventory = "how many available".
- Scalable design: new room types added by inserting into the map.

## Flow
1. System initializes RoomInventory.
2. Room types registered with availability counts.
3. Availability stored and retrieved from HashMap.
4. Updates performed via updateAvailability().
5. Current inventory state displayed when requested.

## Key Concepts
- Problem solved: scattered variables → inconsistent state.
- HashMap provides O(1) average lookup and update.
- Encapsulation ensures controlled access to inventory.
- Extensibility: easy to add new room types without changing main logic.

## Benefits
- Single source of truth for availability.
- Fast and efficient inventory access.
- Cleaner, scalable design.
- Clear separation between room definition and availability.

## Drawbacks of Previous Use Case
- Independent variables for availability.
- Risk of duplication and inconsistency.
- Poor scalability as system complexity grows.
