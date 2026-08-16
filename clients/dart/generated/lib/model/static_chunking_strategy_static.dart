//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StaticChunkingStrategyStatic {
  /// Returns a new [StaticChunkingStrategyStatic] instance.
  StaticChunkingStrategyStatic({
    required this.maxChunkSizeTokens,
    required this.chunkOverlapTokens,
  });

  /// The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
  ///
  /// Minimum value: 100
  /// Maximum value: 4096
  int maxChunkSizeTokens;

  /// The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
  int chunkOverlapTokens;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StaticChunkingStrategyStatic &&
    other.maxChunkSizeTokens == maxChunkSizeTokens &&
    other.chunkOverlapTokens == chunkOverlapTokens;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxChunkSizeTokens.hashCode) +
    (chunkOverlapTokens.hashCode);

  @override
  String toString() => 'StaticChunkingStrategyStatic[maxChunkSizeTokens=$maxChunkSizeTokens, chunkOverlapTokens=$chunkOverlapTokens]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'max_chunk_size_tokens'] = this.maxChunkSizeTokens;
      json[r'chunk_overlap_tokens'] = this.chunkOverlapTokens;
    return json;
  }

  /// Returns a new [StaticChunkingStrategyStatic] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StaticChunkingStrategyStatic? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "StaticChunkingStrategyStatic[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "StaticChunkingStrategyStatic[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return StaticChunkingStrategyStatic(
        maxChunkSizeTokens: mapValueOfType<int>(json, r'max_chunk_size_tokens')!,
        chunkOverlapTokens: mapValueOfType<int>(json, r'chunk_overlap_tokens')!,
      );
    }
    return null;
  }

  static List<StaticChunkingStrategyStatic> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StaticChunkingStrategyStatic>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StaticChunkingStrategyStatic.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StaticChunkingStrategyStatic> mapFromJson(dynamic json) {
    final map = <String, StaticChunkingStrategyStatic>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StaticChunkingStrategyStatic.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StaticChunkingStrategyStatic-objects as value to a dart map
  static Map<String, List<StaticChunkingStrategyStatic>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StaticChunkingStrategyStatic>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StaticChunkingStrategyStatic.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'max_chunk_size_tokens',
    'chunk_overlap_tokens',
  };
}

