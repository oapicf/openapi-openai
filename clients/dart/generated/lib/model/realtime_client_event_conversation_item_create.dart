//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventConversationItemCreate {
  /// Returns a new [RealtimeClientEventConversationItemCreate] instance.
  RealtimeClientEventConversationItemCreate({
    this.eventId,
    required this.type,
    this.previousItemId,
    required this.item,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `conversation.item.create`.
  RealtimeClientEventConversationItemCreateTypeEnum type;

  /// The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? previousItemId;

  RealtimeConversationItem item;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventConversationItemCreate &&
    other.eventId == eventId &&
    other.type == type &&
    other.previousItemId == previousItemId &&
    other.item == item;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode) +
    (previousItemId == null ? 0 : previousItemId!.hashCode) +
    (item.hashCode);

  @override
  String toString() => 'RealtimeClientEventConversationItemCreate[eventId=$eventId, type=$type, previousItemId=$previousItemId, item=$item]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
    if (this.previousItemId != null) {
      json[r'previous_item_id'] = this.previousItemId;
    } else {
      json[r'previous_item_id'] = null;
    }
      json[r'item'] = this.item;
    return json;
  }

  /// Returns a new [RealtimeClientEventConversationItemCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventConversationItemCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeClientEventConversationItemCreate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeClientEventConversationItemCreate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeClientEventConversationItemCreate(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventConversationItemCreateTypeEnum.fromJson(json[r'type'])!,
        previousItemId: mapValueOfType<String>(json, r'previous_item_id'),
        item: RealtimeConversationItem.fromJson(json[r'item'])!,
      );
    }
    return null;
  }

  static List<RealtimeClientEventConversationItemCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventConversationItemCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventConversationItemCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventConversationItemCreate> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventConversationItemCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventConversationItemCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventConversationItemCreate-objects as value to a dart map
  static Map<String, List<RealtimeClientEventConversationItemCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventConversationItemCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventConversationItemCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'item',
  };
}

/// The event type, must be `conversation.item.create`.
class RealtimeClientEventConversationItemCreateTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeClientEventConversationItemCreateTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodCreate = RealtimeClientEventConversationItemCreateTypeEnum._(r'conversation.item.create');

  /// List of all possible values in this [enum][RealtimeClientEventConversationItemCreateTypeEnum].
  static const values = <RealtimeClientEventConversationItemCreateTypeEnum>[
    conversationPeriodItemPeriodCreate,
  ];

  static RealtimeClientEventConversationItemCreateTypeEnum? fromJson(dynamic value) => RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer().decode(value);

  static List<RealtimeClientEventConversationItemCreateTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventConversationItemCreateTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventConversationItemCreateTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventConversationItemCreateTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventConversationItemCreateTypeEnum].
class RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer {
  factory RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer._();

  const RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventConversationItemCreateTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeClientEventConversationItemCreateTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventConversationItemCreateTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.create': return RealtimeClientEventConversationItemCreateTypeEnum.conversationPeriodItemPeriodCreate;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer] instance.
  static RealtimeClientEventConversationItemCreateTypeEnumTypeTransformer? _instance;
}


