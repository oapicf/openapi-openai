//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseAudioDelta {
  /// Returns a new [RealtimeServerEventResponseAudioDelta] instance.
  RealtimeServerEventResponseAudioDelta({
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

  /// The event type, must be `response.audio.delta`.
  RealtimeServerEventResponseAudioDeltaTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The index of the content part in the item's content array.
  int contentIndex;

  /// Base64-encoded audio data delta.
  String delta;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseAudioDelta &&
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
  String toString() => 'RealtimeServerEventResponseAudioDelta[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, contentIndex=$contentIndex, delta=$delta]';

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

  /// Returns a new [RealtimeServerEventResponseAudioDelta] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseAudioDelta? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'event_id'), 'Required key "RealtimeServerEventResponseAudioDelta[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RealtimeServerEventResponseAudioDelta[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[type]" has a null value in JSON.');
        assert(json.containsKey(r'response_id'), 'Required key "RealtimeServerEventResponseAudioDelta[response_id]" is missing from JSON.');
        assert(json[r'response_id'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[response_id]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "RealtimeServerEventResponseAudioDelta[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'output_index'), 'Required key "RealtimeServerEventResponseAudioDelta[output_index]" is missing from JSON.');
        assert(json[r'output_index'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[output_index]" has a null value in JSON.');
        assert(json.containsKey(r'content_index'), 'Required key "RealtimeServerEventResponseAudioDelta[content_index]" is missing from JSON.');
        assert(json[r'content_index'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[content_index]" has a null value in JSON.');
        assert(json.containsKey(r'delta'), 'Required key "RealtimeServerEventResponseAudioDelta[delta]" is missing from JSON.');
        assert(json[r'delta'] != null, 'Required key "RealtimeServerEventResponseAudioDelta[delta]" has a null value in JSON.');
        return true;
      }());

      return RealtimeServerEventResponseAudioDelta(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseAudioDeltaTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        delta: mapValueOfType<String>(json, r'delta')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseAudioDelta> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioDelta>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioDelta.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseAudioDelta> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseAudioDelta>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseAudioDelta.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseAudioDelta-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseAudioDelta>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseAudioDelta>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseAudioDelta.listFromJson(entry.value, growable: growable,);
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

/// The event type, must be `response.audio.delta`.
enum RealtimeServerEventResponseAudioDeltaTypeEnum {
  responsePeriodAudioPeriodDelta._(r'response.audio.delta'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeServerEventResponseAudioDeltaTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeServerEventResponseAudioDeltaTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeServerEventResponseAudioDeltaTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeServerEventResponseAudioDeltaTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeServerEventResponseAudioDeltaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioDeltaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioDeltaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseAudioDeltaTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseAudioDeltaTypeEnum].
class RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseAudioDeltaTypeEnum data) => data._value;

  /// Returns the instance of [RealtimeServerEventResponseAudioDeltaTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseAudioDeltaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeServerEventResponseAudioDeltaTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'response.audio.delta': return RealtimeServerEventResponseAudioDeltaTypeEnum.responsePeriodAudioPeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeServerEventResponseAudioDeltaTypeEnumTypeTransformer? _instance;
}


