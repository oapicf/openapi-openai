//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventInputAudioBufferSpeechStopped {
  /// Returns a new [RealtimeServerEventInputAudioBufferSpeechStopped] instance.
  RealtimeServerEventInputAudioBufferSpeechStopped({
    required this.eventId,
    required this.type,
    required this.audioEndMs,
    required this.itemId,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `input_audio_buffer.speech_stopped`.
  RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum type;

  /// Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
  int audioEndMs;

  /// The ID of the user message item that will be created.
  String itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventInputAudioBufferSpeechStopped &&
    other.eventId == eventId &&
    other.type == type &&
    other.audioEndMs == audioEndMs &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (audioEndMs.hashCode) +
    (itemId.hashCode);

  @override
  String toString() => 'RealtimeServerEventInputAudioBufferSpeechStopped[eventId=$eventId, type=$type, audioEndMs=$audioEndMs, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'audio_end_ms'] = this.audioEndMs;
      json[r'item_id'] = this.itemId;
    return json;
  }

  /// Returns a new [RealtimeServerEventInputAudioBufferSpeechStopped] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventInputAudioBufferSpeechStopped? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventInputAudioBufferSpeechStopped[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventInputAudioBufferSpeechStopped[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventInputAudioBufferSpeechStopped(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum.fromJson(json[r'type'])!,
        audioEndMs: mapValueOfType<int>(json, r'audio_end_ms')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventInputAudioBufferSpeechStopped> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferSpeechStopped>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferSpeechStopped.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventInputAudioBufferSpeechStopped> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventInputAudioBufferSpeechStopped>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventInputAudioBufferSpeechStopped.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventInputAudioBufferSpeechStopped-objects as value to a dart map
  static Map<String, List<RealtimeServerEventInputAudioBufferSpeechStopped>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventInputAudioBufferSpeechStopped>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventInputAudioBufferSpeechStopped.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'audio_end_ms',
    'item_id',
  };
}

/// The event type, must be `input_audio_buffer.speech_stopped`.
class RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodSpeechStopped = RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum._(r'input_audio_buffer.speech_stopped');

  /// List of all possible values in this [enum][RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum].
  static const values = <RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum>[
    inputAudioBufferPeriodSpeechStopped,
  ];

  static RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum? fromJson(dynamic value) => RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum].
class RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer {
  factory RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer._();

  const RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.speech_stopped': return RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum.inputAudioBufferPeriodSpeechStopped;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnumTypeTransformer? _instance;
}


