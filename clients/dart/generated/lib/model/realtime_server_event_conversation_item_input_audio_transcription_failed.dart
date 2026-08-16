//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
  /// Returns a new [RealtimeServerEventConversationItemInputAudioTranscriptionFailed] instance.
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed({
    required this.eventId,
    required this.type,
    required this.itemId,
    required this.contentIndex,
    required this.error,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.item.input_audio_transcription.failed`. 
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum type;

  /// The ID of the user message item.
  String itemId;

  /// The index of the content part containing the audio.
  int contentIndex;

  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationItemInputAudioTranscriptionFailed &&
    other.eventId == eventId &&
    other.type == type &&
    other.itemId == itemId &&
    other.contentIndex == contentIndex &&
    other.error == error;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (itemId.hashCode) +
    (contentIndex.hashCode) +
    (error.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationItemInputAudioTranscriptionFailed[eventId=$eventId, type=$type, itemId=$itemId, contentIndex=$contentIndex, error=$error]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'item_id'] = this.itemId;
      json[r'content_index'] = this.contentIndex;
      json[r'error'] = this.error;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationItemInputAudioTranscriptionFailed] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationItemInputAudioTranscriptionFailed? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionFailed[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionFailed[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum.fromJson(json[r'type'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.fromJson(json[r'error'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationItemInputAudioTranscriptionFailed> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemInputAudioTranscriptionFailed>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionFailed.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationItemInputAudioTranscriptionFailed> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationItemInputAudioTranscriptionFailed>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionFailed.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationItemInputAudioTranscriptionFailed-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationItemInputAudioTranscriptionFailed>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationItemInputAudioTranscriptionFailed>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationItemInputAudioTranscriptionFailed.listFromJson(entry.value, growable: growable,);
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
    'error',
  };
}

/// The event type, must be `conversation.item.input_audio_transcription.failed`. 
class RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodItemPeriodInputAudioTranscriptionPeriodFailed = RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum._(r'conversation.item.input_audio_transcription.failed');

  /// List of all possible values in this [enum][RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum].
  static const values = <RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum>[
    conversationPeriodItemPeriodInputAudioTranscriptionPeriodFailed,
  ];

  static RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum].
class RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.item.input_audio_transcription.failed': return RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum.conversationPeriodItemPeriodInputAudioTranscriptionPeriodFailed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumTypeTransformer? _instance;
}


