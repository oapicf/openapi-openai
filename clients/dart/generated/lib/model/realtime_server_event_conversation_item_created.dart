//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationItemCreated {
  /// Returns a new [RealtimeServerEventConversationItemCreated] instance.
  RealtimeServerEventConversationItemCreated({
    required this.eventId,
    required this.type,
    required this.previousItemId,
    required this.item,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.item.created`.
  RealtimeServerEventConversationItemCreatedTypeEnum type;

  /// The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
  String previousItemId;

  RealtimeConversationItem item;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationItemCreated &&
    other.eventId == eventId &&
    other.type == type &&
    other.previousItemId == previousItemId &&
    other.item == item;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (previousItemId.hashCode) +
    (item.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationItemCreated[eventId=$eventId, type=$type, previousItemId=$previousItemId, item=$item]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'previous_item_id'] = this.previousItemId;
      json[r'item'] = this.item;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationItemCreated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationItemCreated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventConversationItemCreated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventConversationItemCreated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventConversationItemCreated(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationItemCreatedTypeEnum.fromJson(json[r'type'])!,
        previousItemId: mapValueOfType<String>(json, r'previous_item_id')!,
        item: RealtimeConversationItem.fromJson(json[r'item'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationItemCreated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemCreated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemCreated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationItemCreated> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationItemCreated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationItemCreated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationItemCreated-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationItemCreated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationItemCreated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationItemCreated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'previous_item_id',
    'item',
  };
}

/// The event type, must be `conversation.item.created`.
class RealtimeServerEventConversationItemCreatedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventConversationItemCreatedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodCreated = RealtimeServerEventConversationItemCreatedTypeEnum._(r'conversation.item.created');

  /// List of all possible values in this [enum][RealtimeServerEventConversationItemCreatedTypeEnum].
  static const values = <RealtimeServerEventConversationItemCreatedTypeEnum>[
    conversationPeriodItemPeriodCreated,
  ];

  static RealtimeServerEventConversationItemCreatedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventConversationItemCreatedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemCreatedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemCreatedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationItemCreatedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationItemCreatedTypeEnum].
class RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationItemCreatedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventConversationItemCreatedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationItemCreatedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.created': return RealtimeServerEventConversationItemCreatedTypeEnum.conversationPeriodItemPeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventConversationItemCreatedTypeEnumTypeTransformer? _instance;
}


