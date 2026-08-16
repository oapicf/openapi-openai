//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseFunctionCallArgumentsDone {
  /// Returns a new [RealtimeServerEventResponseFunctionCallArgumentsDone] instance.
  RealtimeServerEventResponseFunctionCallArgumentsDone({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.callId,
    required this.arguments,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.function_call_arguments.done`. 
  RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the function call item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The ID of the function call.
  String callId;

  /// The final arguments as a JSON string.
  String arguments;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseFunctionCallArgumentsDone &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.callId == callId &&
    other.arguments == arguments;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (callId.hashCode) +
    (arguments.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseFunctionCallArgumentsDone[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, callId=$callId, arguments=$arguments]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'call_id'] = this.callId;
      json[r'arguments'] = this.arguments;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseFunctionCallArgumentsDone] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseFunctionCallArgumentsDone? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseFunctionCallArgumentsDone[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseFunctionCallArgumentsDone[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseFunctionCallArgumentsDone(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        callId: mapValueOfType<String>(json, r'call_id')!,
        arguments: mapValueOfType<String>(json, r'arguments')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseFunctionCallArgumentsDone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseFunctionCallArgumentsDone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseFunctionCallArgumentsDone> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseFunctionCallArgumentsDone>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDone.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseFunctionCallArgumentsDone-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseFunctionCallArgumentsDone>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseFunctionCallArgumentsDone>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseFunctionCallArgumentsDone.listFromJson(entry.value, growable: growable,);
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
    'arguments',
  };
}

/// The event type, must be `response.function_call_arguments.done`. 
class RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodFunctionCallArgumentsPeriodDone = RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum._(r'response.function_call_arguments.done');

  /// List of all possible values in this [enum][RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum].
  static const values = <RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum>[
    responsePeriodFunctionCallArgumentsPeriodDone,
  ];

  static RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum].
class RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.function_call_arguments.done': return RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnum.responsePeriodFunctionCallArgumentsPeriodDone;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseFunctionCallArgumentsDoneTypeEnumTypeTransformer? _instance;
}


