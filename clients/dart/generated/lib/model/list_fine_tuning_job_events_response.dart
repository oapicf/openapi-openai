//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListFineTuningJobEventsResponse {
  /// Returns a new [ListFineTuningJobEventsResponse] instance.
  ListFineTuningJobEventsResponse({
    this.data = const [],
    required this.object,
  });

  List<FineTuningJobEvent> data;

  ListFineTuningJobEventsResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListFineTuningJobEventsResponse &&
    _deepEquality.equals(other.data, data) &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'ListFineTuningJobEventsResponse[data=$data, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'data'] = this.data;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [ListFineTuningJobEventsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListFineTuningJobEventsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListFineTuningJobEventsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListFineTuningJobEventsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListFineTuningJobEventsResponse(
        data: FineTuningJobEvent.listFromJson(json[r'data']),
        object: ListFineTuningJobEventsResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<ListFineTuningJobEventsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListFineTuningJobEventsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListFineTuningJobEventsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListFineTuningJobEventsResponse> mapFromJson(dynamic json) {
    final map = <String, ListFineTuningJobEventsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListFineTuningJobEventsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListFineTuningJobEventsResponse-objects as value to a dart map
  static Map<String, List<ListFineTuningJobEventsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListFineTuningJobEventsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListFineTuningJobEventsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'data',
    'object',
  };
}


class ListFineTuningJobEventsResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ListFineTuningJobEventsResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ListFineTuningJobEventsResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ListFineTuningJobEventsResponseObjectEnum].
  static const values = <ListFineTuningJobEventsResponseObjectEnum>[
    list,
  ];

  static ListFineTuningJobEventsResponseObjectEnum? fromJson(dynamic value) => ListFineTuningJobEventsResponseObjectEnumTypeTransformer().decode(value);

  static List<ListFineTuningJobEventsResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListFineTuningJobEventsResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListFineTuningJobEventsResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ListFineTuningJobEventsResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ListFineTuningJobEventsResponseObjectEnum].
class ListFineTuningJobEventsResponseObjectEnumTypeTransformer {
  factory ListFineTuningJobEventsResponseObjectEnumTypeTransformer() => _instance ??= const ListFineTuningJobEventsResponseObjectEnumTypeTransformer._();

  const ListFineTuningJobEventsResponseObjectEnumTypeTransformer._();

  String encode(ListFineTuningJobEventsResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ListFineTuningJobEventsResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ListFineTuningJobEventsResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ListFineTuningJobEventsResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ListFineTuningJobEventsResponseObjectEnumTypeTransformer] instance.
  static ListFineTuningJobEventsResponseObjectEnumTypeTransformer? _instance;
}


