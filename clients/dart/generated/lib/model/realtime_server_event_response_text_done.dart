//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseTextDone {
  /// Returns a new [RealtimeServerEventResponseTextDone] instance.
  RealtimeServerEventResponseTextDone({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.contentIndex,
    required this.text,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.text.done`.
  RealtimeServerEventResponseTextDoneTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The index of the content part in the item's content array.
  int contentIndex;

  /// The final text content.
  String text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseTextDone &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.contentIndex == contentIndex &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (contentIndex.hashCode) +
    (text.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseTextDone[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, contentIndex=$contentIndex, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'content_index'] = this.contentIndex;
      json[r'text'] = this.text;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseTextDone] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseTextDone? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'event_id'), 'Required key "RealtimeServerEventResponseTextDone[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "RealtimeServerEventResponseTextDone[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "RealtimeServerEventResponseTextDone[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "RealtimeServerEventResponseTextDone[type]" has a null value in JSON.');
        assert(json.containsKey(r'response_id'), 'Required key "RealtimeServerEventResponseTextDone[response_id]" is missing from JSON.');
        assert(json[r'response_id'] != null, 'Required key "RealtimeServerEventResponseTextDone[response_id]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "RealtimeServerEventResponseTextDone[item_id]" is missing from JSON.');
        assert(json[r'item_id'] != null, 'Required key "RealtimeServerEventResponseTextDone[item_id]" has a null value in JSON.');
        assert(json.containsKey(r'output_index'), 'Required key "RealtimeServerEventResponseTextDone[output_index]" is missing from JSON.');
        assert(json[r'output_index'] != null, 'Required key "RealtimeServerEventResponseTextDone[output_index]" has a null value in JSON.');
        assert(json.containsKey(r'content_index'), 'Required key "RealtimeServerEventResponseTextDone[content_index]" is missing from JSON.');
        assert(json[r'content_index'] != null, 'Required key "RealtimeServerEventResponseTextDone[content_index]" has a null value in JSON.');
        assert(json.containsKey(r'text'), 'Required key "RealtimeServerEventResponseTextDone[text]" is missing from JSON.');
        assert(json[r'text'] != null, 'Required key "RealtimeServerEventResponseTextDone[text]" has a null value in JSON.');
        return true;
      }());

      return RealtimeServerEventResponseTextDone(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseTextDoneTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        text: mapValueOfType<String>(json, r'text')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseTextDone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseTextDone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseTextDone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseTextDone> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseTextDone>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseTextDone.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseTextDone-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseTextDone>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseTextDone>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseTextDone.listFromJson(entry.value, growable: growable,);
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
    'text',
  };
}

/// The event type, must be `response.text.done`.
enum RealtimeServerEventResponseTextDoneTypeEnum {
  responsePeriodTextPeriodDone._(r'response.text.done'),
  ;

  /// Instantiate a new enum with the provided value.
  const RealtimeServerEventResponseTextDoneTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [RealtimeServerEventResponseTextDoneTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static RealtimeServerEventResponseTextDoneTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [RealtimeServerEventResponseTextDoneTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<RealtimeServerEventResponseTextDoneTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseTextDoneTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseTextDoneTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseTextDoneTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseTextDoneTypeEnum].
class RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseTextDoneTypeEnum data) => data._value;

  /// Returns the instance of [RealtimeServerEventResponseTextDoneTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseTextDoneTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is RealtimeServerEventResponseTextDoneTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'response.text.done': return RealtimeServerEventResponseTextDoneTypeEnum.responsePeriodTextPeriodDone;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static RealtimeServerEventResponseTextDoneTypeEnumTypeTransformer? _instance;
}


