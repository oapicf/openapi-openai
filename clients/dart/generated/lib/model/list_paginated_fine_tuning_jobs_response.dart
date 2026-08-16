//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListPaginatedFineTuningJobsResponse {
  /// Returns a new [ListPaginatedFineTuningJobsResponse] instance.
  ListPaginatedFineTuningJobsResponse({
    this.data = const [],
    required this.hasMore,
    required this.object,
  });

  List<FineTuningJob> data;

  bool hasMore;

  ListPaginatedFineTuningJobsResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListPaginatedFineTuningJobsResponse &&
    _deepEquality.equals(other.data, data) &&
    other.hasMore == hasMore &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data.hashCode) +
    (hasMore.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'ListPaginatedFineTuningJobsResponse[data=$data, hasMore=$hasMore, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'data'] = this.data;
      json[r'has_more'] = this.hasMore;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [ListPaginatedFineTuningJobsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListPaginatedFineTuningJobsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListPaginatedFineTuningJobsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListPaginatedFineTuningJobsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListPaginatedFineTuningJobsResponse(
        data: FineTuningJob.listFromJson(json[r'data']),
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
        object: ListPaginatedFineTuningJobsResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<ListPaginatedFineTuningJobsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListPaginatedFineTuningJobsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListPaginatedFineTuningJobsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListPaginatedFineTuningJobsResponse> mapFromJson(dynamic json) {
    final map = <String, ListPaginatedFineTuningJobsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListPaginatedFineTuningJobsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListPaginatedFineTuningJobsResponse-objects as value to a dart map
  static Map<String, List<ListPaginatedFineTuningJobsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListPaginatedFineTuningJobsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListPaginatedFineTuningJobsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'data',
    'has_more',
    'object',
  };
}


class ListPaginatedFineTuningJobsResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ListPaginatedFineTuningJobsResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ListPaginatedFineTuningJobsResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ListPaginatedFineTuningJobsResponseObjectEnum].
  static const values = <ListPaginatedFineTuningJobsResponseObjectEnum>[
    list,
  ];

  static ListPaginatedFineTuningJobsResponseObjectEnum? fromJson(dynamic value) => ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer().decode(value);

  static List<ListPaginatedFineTuningJobsResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListPaginatedFineTuningJobsResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListPaginatedFineTuningJobsResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ListPaginatedFineTuningJobsResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ListPaginatedFineTuningJobsResponseObjectEnum].
class ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer {
  factory ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer() => _instance ??= const ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer._();

  const ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer._();

  String encode(ListPaginatedFineTuningJobsResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ListPaginatedFineTuningJobsResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ListPaginatedFineTuningJobsResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ListPaginatedFineTuningJobsResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer] instance.
  static ListPaginatedFineTuningJobsResponseObjectEnumTypeTransformer? _instance;
}


