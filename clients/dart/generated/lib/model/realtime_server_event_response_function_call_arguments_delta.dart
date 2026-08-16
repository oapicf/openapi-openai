//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseFunctionCallArgumentsDelta {
  /// Returns a new [RealtimeServerEventResponseFunctionCallArgumentsDelta] instance.
  RealtimeServerEventResponseFunctionCallArgumentsDelta({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.callId,
    required this.delta,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.function_call_arguments.delta`. 
  RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the function call item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The ID of the function call.
  String callId;

  /// The arguments delta as a JSON string.
  String delta;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseFunctionCallArgumentsDelta &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.callId == callId &&
    other.delta == delta;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (callId.hashCode) +
    (delta.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseFunctionCallArgumentsDelta[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, callId=$callId, delta=$delta]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'call_id'] = this.callId;
      json[r'delta'] = this.delta;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseFunctionCallArgumentsDelta] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseFunctionCallArgumentsDelta? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseFunctionCallArgumentsDelta[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseFunctionCallArgumentsDelta[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseFunctionCallArgumentsDelta(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        callId: mapValueOfType<String>(json, r'call_id')!,
        delta: mapValueOfType<String>(json, r'delta')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseFunctionCallArgumentsDelta> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseFunctionCallArgumentsDelta>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDelta.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseFunctionCallArgumentsDelta> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseFunctionCallArgumentsDelta>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDelta.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseFunctionCallArgumentsDelta-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseFunctionCallArgumentsDelta>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseFunctionCallArgumentsDelta>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseFunctionCallArgumentsDelta.listFromJson(entry.value, growable: growable,);
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
    'call_id',
    'delta',
  };
}

/// The event type, must be `response.function_call_arguments.delta`. 
class RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodFunctionCallArgumentsPeriodDelta = RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum._(r'response.function_call_arguments.delta');

  /// List of all possible values in this [enum][RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum].
  static const values = <RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum>[
    responsePeriodFunctionCallArgumentsPeriodDelta,
  ];

  static RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum].
class RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.function_call_arguments.delta': return RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnum.responsePeriodFunctionCallArgumentsPeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseFunctionCallArgumentsDeltaTypeEnumTypeTransformer? _instance;
}


