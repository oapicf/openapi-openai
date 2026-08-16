//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventConversationItemTruncate {
  /// Returns a new [RealtimeClientEventConversationItemTruncate] instance.
  RealtimeClientEventConversationItemTruncate({
    this.eventId,
    required this.type,
    required this.itemId,
    required this.contentIndex,
    required this.audioEndMs,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `conversation.item.truncate`.
  RealtimeClientEventConversationItemTruncateTypeEnum type;

  /// The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
  String itemId;

  /// The index of the content part to truncate. Set this to 0.
  int contentIndex;

  /// Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
  int audioEndMs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventConversationItemTruncate &&
    other.eventId == eventId &&
    other.type == type &&
    other.itemId == itemId &&
    other.contentIndex == contentIndex &&
    other.audioEndMs == audioEndMs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode) +
    (itemId.hashCode) +
    (contentIndex.hashCode) +
    (audioEndMs.hashCode);

  @override
  String toString() => 'RealtimeClientEventConversationItemTruncate[eventId=$eventId, type=$type, itemId=$itemId, contentIndex=$contentIndex, audioEndMs=$audioEndMs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
      json[r'item_id'] = this.itemId;
      json[r'content_index'] = this.contentIndex;
      json[r'audio_end_ms'] = this.audioEndMs;
    return json;
  }

  /// Returns a new [RealtimeClientEventConversationItemTruncate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventConversationItemTruncate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeClientEventConversationItemTruncate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeClientEventConversationItemTruncate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeClientEventConversationItemTruncate(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventConversationItemTruncateTypeEnum.fromJson(json[r'type'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        audioEndMs: mapValueOfType<int>(json, r'audio_end_ms')!,
      );
    }
    return null;
  }

  static List<RealtimeClientEventConversationItemTruncate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventConversationItemTruncate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventConversationItemTruncate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventConversationItemTruncate> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventConversationItemTruncate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventConversationItemTruncate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventConversationItemTruncate-objects as value to a dart map
  static Map<String, List<RealtimeClientEventConversationItemTruncate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventConversationItemTruncate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventConversationItemTruncate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'item_id',
    'content_index',
    'audio_end_ms',
  };
}

/// The event type, must be `conversation.item.truncate`.
class RealtimeClientEventConversationItemTruncateTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeClientEventConversationItemTruncateTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodTruncate = RealtimeClientEventConversationItemTruncateTypeEnum._(r'conversation.item.truncate');

  /// List of all possible values in this [enum][RealtimeClientEventConversationItemTruncateTypeEnum].
  static const values = <RealtimeClientEventConversationItemTruncateTypeEnum>[
    conversationPeriodItemPeriodTruncate,
  ];

  static RealtimeClientEventConversationItemTruncateTypeEnum? fromJson(dynamic value) => RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer().decode(value);

  static List<RealtimeClientEventConversationItemTruncateTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventConversationItemTruncateTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventConversationItemTruncateTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventConversationItemTruncateTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventConversationItemTruncateTypeEnum].
class RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer {
  factory RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer._();

  const RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventConversationItemTruncateTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeClientEventConversationItemTruncateTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventConversationItemTruncateTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.truncate': return RealtimeClientEventConversationItemTruncateTypeEnum.conversationPeriodItemPeriodTruncate;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer] instance.
  static RealtimeClientEventConversationItemTruncateTypeEnumTypeTransformer? _instance;
}


