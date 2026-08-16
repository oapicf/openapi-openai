//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationItemDeleted {
  /// Returns a new [RealtimeServerEventConversationItemDeleted] instance.
  RealtimeServerEventConversationItemDeleted({
    required this.eventId,
    required this.type,
    required this.itemId,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.item.deleted`.
  RealtimeServerEventConversationItemDeletedTypeEnum type;

  /// The ID of the item that was deleted.
  String itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationItemDeleted &&
    other.eventId == eventId &&
    other.type == type &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (itemId.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationItemDeleted[eventId=$eventId, type=$type, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'item_id'] = this.itemId;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationItemDeleted] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationItemDeleted? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventConversationItemDeleted[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventConversationItemDeleted[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventConversationItemDeleted(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationItemDeletedTypeEnum.fromJson(json[r'type'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationItemDeleted> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemDeleted>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemDeleted.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationItemDeleted> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationItemDeleted>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationItemDeleted.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationItemDeleted-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationItemDeleted>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationItemDeleted>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationItemDeleted.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'item_id',
  };
}

/// The event type, must be `conversation.item.deleted`.
class RealtimeServerEventConversationItemDeletedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventConversationItemDeletedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodDeleted = RealtimeServerEventConversationItemDeletedTypeEnum._(r'conversation.item.deleted');

  /// List of all possible values in this [enum][RealtimeServerEventConversationItemDeletedTypeEnum].
  static const values = <RealtimeServerEventConversationItemDeletedTypeEnum>[
    conversationPeriodItemPeriodDeleted,
  ];

  static RealtimeServerEventConversationItemDeletedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventConversationItemDeletedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemDeletedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemDeletedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationItemDeletedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationItemDeletedTypeEnum].
class RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationItemDeletedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventConversationItemDeletedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationItemDeletedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.deleted': return RealtimeServerEventConversationItemDeletedTypeEnum.conversationPeriodItemPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventConversationItemDeletedTypeEnumTypeTransformer? _instance;
}


