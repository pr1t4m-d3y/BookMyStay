# Book My Stay App – Use Case 7

## Approach
- Extends booking model with optional services.
- AddOnService represents individual offerings (e.g., Breakfast, Spa).
- AddOnServiceManager maps reservation IDs to lists of services.
- Services are attached after room allocation, without affecting inventory.
- Costs aggregated separately from booking logic.

## Flow
1. Guest selects one or more add-on services.
2. Services are added to a list.
3. List mapped to reservation ID in AddOnServiceManager.
4. Total cost calculated for selected services.
5. Core booking and inventory state remain unchanged.

## Key Concepts
- Business extensibility: supports real-world booking enhancements.
- One-to-many relationship: one reservation → many services.
- Map + List combination for efficient lookup and ordered storage.
- Composition over inheritance for flexible feature growth.
- Separation of core and optional features.
- Modular cost aggregation.

## Benefits
- Flexible attachment of optional services.
- Clean mapping between bookings and value-added features.
- Easy expansion of services without core booking changes.
- Preserves stability of booking and inventory logic.

## Drawbacks of Previous Use Case
- Use Case 6 confirmed room allocation but treated bookings as static.
- No support for optional services or enhancements.
