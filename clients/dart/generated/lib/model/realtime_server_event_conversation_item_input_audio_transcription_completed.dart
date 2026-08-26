//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
  /// Returns a new [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] instance.
  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted({
    required this.eventId,
    required this.type,
    required this.itemId,
    required this.contentIndex,
    required this.transcript,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.item.input_audio_transcription.completed`. 
  RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum type;

  /// The ID of the user message item containing the audio.
  String itemId;

  /// The index of the content part containing the audio.
  int contentIndex;

  /// The transcribed text.
  String transcript;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationItemInputAudioTranscriptionCompleted &&
    other.eventId == eventId &&
    other.type == type &&
    other.itemId == itemId &&
    other.contentIndex == contentIndex &&
    other.transcript == transcript;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (itemId.hashCode) +
    (contentIndex.hashCode) +
    (transcript.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[eventId=$eventId, type=$type, itemId=$itemId, contentIndex=$contentIndex, transcript=$transcript]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'item_id'] = this.itemId;
      json[r'content_index'] = this.contentIndex;
      json[r'transcript'] = this.transcript;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationItemInputAudioTranscriptionCompleted? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'event_id'), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[type]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'content_index'), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[content_index]" is missing from JSON.');
        assert(json[r'content_index'] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[content_index]" has a null value in JSON.');
        assert(json.containsKey(r'transcript'), 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[transcript]" is missing from JSON.');
        assert(json[r'transcript'] != null, 'Required key "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted[transcript]" has a null value in JSON.');
        return true;
      }());

      return RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum.fromJson(json[r'type'])!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        transcript: mapValueOfType<String>(json, r'transcript')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemInputAudioTranscriptionCompleted>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationItemInputAudioTranscriptionCompleted> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationItemInputAudioTranscriptionCompleted>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.listFromJson(entry.value, growable: growable,);
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
    'transcript',
  };
}

/// The event type, must be `conversation.item.input_audio_transcription.completed`. 
enum RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum {
  conversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted._(r'conversation.item.input_audio_transcription.completed'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum].
class RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum data) => data._value;

  /// Returns the instance of [RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'conversation.item.input_audio_transcription.completed': return RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum.conversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumTypeTransformer? _instance;
}


