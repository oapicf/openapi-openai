//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FileSearchRankingOptions {
  /// Returns a new [FileSearchRankingOptions] instance.
  FileSearchRankingOptions({
    this.ranker,
    required this.scoreThreshold,
  });

  /// The ranker to use for the file search. If not specified will use the `auto` ranker.
  FileSearchRankingOptionsRankerEnum? ranker;

  /// The score threshold for the file search. All values must be a floating point number between 0 and 1.
  ///
  /// Minimum value: 0
  /// Maximum value: 1
  num scoreThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FileSearchRankingOptions &&
    other.ranker == ranker &&
    other.scoreThreshold == scoreThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ranker == null ? 0 : ranker!.hashCode) +
    (scoreThreshold.hashCode);

  @override
  String toString() => 'FileSearchRankingOptions[ranker=$ranker, scoreThreshold=$scoreThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ranker != null) {
      json[r'ranker'] = this.ranker;
    } else {
      json[r'ranker'] = null;
    }
      json[r'score_threshold'] = this.scoreThreshold;
    return json;
  }

  /// Returns a new [FileSearchRankingOptions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FileSearchRankingOptions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FileSearchRankingOptions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FileSearchRankingOptions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FileSearchRankingOptions(
        ranker: FileSearchRankingOptionsRankerEnum.fromJson(json[r'ranker']),
        scoreThreshold: num.parse('${json[r'score_threshold']}'),
      );
    }
    return null;
  }

  static List<FileSearchRankingOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FileSearchRankingOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FileSearchRankingOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FileSearchRankingOptions> mapFromJson(dynamic json) {
    final map = <String, FileSearchRankingOptions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FileSearchRankingOptions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FileSearchRankingOptions-objects as value to a dart map
  static Map<String, List<FileSearchRankingOptions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FileSearchRankingOptions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FileSearchRankingOptions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'score_threshold',
  };
}

/// The ranker to use for the file search. If not specified will use the `auto` ranker.
class FileSearchRankingOptionsRankerEnum {
  /// Instantiate a new enum with the provided [value].
  const FileSearchRankingOptionsRankerEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = FileSearchRankingOptionsRankerEnum._(r'auto');
  static const default20240821 = FileSearchRankingOptionsRankerEnum._(r'default_2024_08_21');

  /// List of all possible values in this [enum][FileSearchRankingOptionsRankerEnum].
  static const values = <FileSearchRankingOptionsRankerEnum>[
    auto,
    default20240821,
  ];

  static FileSearchRankingOptionsRankerEnum? fromJson(dynamic value) => FileSearchRankingOptionsRankerEnumTypeTransformer().decode(value);

  static List<FileSearchRankingOptionsRankerEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FileSearchRankingOptionsRankerEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FileSearchRankingOptionsRankerEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FileSearchRankingOptionsRankerEnum] to String,
/// and [decode] dynamic data back to [FileSearchRankingOptionsRankerEnum].
class FileSearchRankingOptionsRankerEnumTypeTransformer {
  factory FileSearchRankingOptionsRankerEnumTypeTransformer() => _instance ??= const FileSearchRankingOptionsRankerEnumTypeTransformer._();

  const FileSearchRankingOptionsRankerEnumTypeTransformer._();

  String encode(FileSearchRankingOptionsRankerEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FileSearchRankingOptionsRankerEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FileSearchRankingOptionsRankerEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return FileSearchRankingOptionsRankerEnum.auto;
        case r'default_2024_08_21': return FileSearchRankingOptionsRankerEnum.default20240821;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FileSearchRankingOptionsRankerEnumTypeTransformer] instance.
  static FileSearchRankingOptionsRankerEnumTypeTransformer? _instance;
}


