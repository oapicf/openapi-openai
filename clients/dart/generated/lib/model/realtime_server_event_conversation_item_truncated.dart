//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationItemTruncated {
  /// Returns a new [RealtimeServerEventConversationItemTruncated] instance.
  RealtimeServerEventConversationItemTruncated({
    required this.eventId,
    required this.type,
    required this.itemId,
    required this.contentIndex,
    required this.audioEndMs,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.item.truncated`.
  RealtimeServerEventConversationItemTruncatedTypeEnum type;

  /// The ID of the assistant message item that was truncated.
  String itemId;

  /// The index of the content part that was truncated.
  int contentIndex;

  /// The duration up to which the audio was truncated, in milliseconds. 
  int audioEndMs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationItemTruncated &&
    other.eventId == eventId &&
    other.type == type &&
    other.itemId == itemId &&
    other.contentIndex == contentIndex &&
    other.audioEndMs == audioEndMs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (itemId.hashCode) +
    (contentIndex.hashCode) +
    (audioEndMs.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationItemTruncated[eventId=$eventId, type=$type, itemId=$itemId, contentIndex=$contentIndex, audioEndMs=$audioEndMs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'item_id'] = this.itemId;
      json[r'content_index'] = this.contentIndex;
      json[r'audio_end_ms'] = this.audioEndMs;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationItemTruncated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationItemTruncated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventConversationItemTruncated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventConversationItemTruncated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventConversationItemTruncated(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationItemTruncatedTypeEnum.fromJson(json[r'type'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        audioEndMs: mapValueOfType<int>(json, r'audio_end_ms')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationItemTruncated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemTruncated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemTruncated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationItemTruncated> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationItemTruncated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationItemTruncated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationItemTruncated-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationItemTruncated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationItemTruncated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationItemTruncated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'item_id',
    'content_index',
    'audio_end_ms',
  };
}

/// The event type, must be `conversation.item.truncated`.
class RealtimeServerEventConversationItemTruncatedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventConversationItemTruncatedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodTruncated = RealtimeServerEventConversationItemTruncatedTypeEnum._(r'conversation.item.truncated');

  /// List of all possible values in this [enum][RealtimeServerEventConversationItemTruncatedTypeEnum].
  static const values = <RealtimeServerEventConversationItemTruncatedTypeEnum>[
    conversationPeriodItemPeriodTruncated,
  ];

  static RealtimeServerEventConversationItemTruncatedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventConversationItemTruncatedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemTruncatedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemTruncatedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationItemTruncatedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationItemTruncatedTypeEnum].
class RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationItemTruncatedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventConversationItemTruncatedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationItemTruncatedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.truncated': return RealtimeServerEventConversationItemTruncatedTypeEnum.conversationPeriodItemPeriodTruncated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventConversationItemTruncatedTypeEnumTypeTransformer? _instance;
}


