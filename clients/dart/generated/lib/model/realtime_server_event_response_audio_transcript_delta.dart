//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseAudioTranscriptDelta {
  /// Returns a new [RealtimeServerEventResponseAudioTranscriptDelta] instance.
  RealtimeServerEventResponseAudioTranscriptDelta({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.contentIndex,
    required this.delta,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.audio_transcript.delta`.
  RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The index of the content part in the item's content array.
  int contentIndex;

  /// The transcript delta.
  String delta;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseAudioTranscriptDelta &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.contentIndex == contentIndex &&
    other.delta == delta;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (contentIndex.hashCode) +
    (delta.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseAudioTranscriptDelta[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, contentIndex=$contentIndex, delta=$delta]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'content_index'] = this.contentIndex;
      json[r'delta'] = this.delta;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseAudioTranscriptDelta] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseAudioTranscriptDelta? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseAudioTranscriptDelta[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseAudioTranscriptDelta[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseAudioTranscriptDelta(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        delta: mapValueOfType<String>(json, r'delta')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseAudioTranscriptDelta> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioTranscriptDelta>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioTranscriptDelta.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseAudioTranscriptDelta> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseAudioTranscriptDelta>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseAudioTranscriptDelta.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseAudioTranscriptDelta-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseAudioTranscriptDelta>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseAudioTranscriptDelta>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseAudioTranscriptDelta.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'response_id',
    'item_id',
    'output_index',
    'content_index',
    'delta',
  };
}

/// The event type, must be `response.audio_transcript.delta`.
class RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodAudioTranscriptPeriodDelta = RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum._(r'response.audio_transcript.delta');

  /// List of all possible values in this [enum][RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum].
  static const values = <RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum>[
    responsePeriodAudioTranscriptPeriodDelta,
  ];

  static RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum].
class RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.audio_transcript.delta': return RealtimeServerEventResponseAudioTranscriptDeltaTypeEnum.responsePeriodAudioTranscriptPeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseAudioTranscriptDeltaTypeEnumTypeTransformer? _instance;
}


